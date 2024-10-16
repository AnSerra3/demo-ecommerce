CREATE TABLE cart_product (
    user_id BIGINT,
    product_id BIGINT,
    quantity INT NOT NULL,
    PRIMARY KEY (user_id, product_id),
    FOREIGN KEY (user_id) REFERENCES userr(user_id),
    FOREIGN KEY (product_id) REFERENCES product(product_id),
    CONSTRAINT quantity_constraint CHECK ( quantity > 0 )
);

CREATE TABLE review (
                        user_id BIGINT,
                        product_id BIGINT,
                        rating INT NOT NULL,
                        message TEXT NOT NULL,
                        title VARCHAR(255) NOT NULL,
                        timestamp TIMESTAMP,
                        PRIMARY KEY (user_id, timestamp),
                        FOREIGN KEY (user_id) REFERENCES userr(user_id),
                        FOREIGN KEY (product_id) REFERENCES product(product_id),
                        CONSTRAINT rating_constraint CHECK ( rating >= 0 AND rating <= 5 )
);

CREATE TABLE review_attachment (
    review_attachment_id BIGSERIAL PRIMARY KEY,
    attachment_url VARCHAR(255) NOT NULL,
    user_id BIGINT,
    timestamp TIMESTAMP,
    FOREIGN KEY (user_id, timestamp) REFERENCES review(user_id, timestamp)
);

CREATE TABLE product_wishlist (
    product_id BIGINT,
    wishlist_id BIGINT,
    PRIMARY KEY (product_id, wishlist_id),
    FOREIGN KEY (product_id) REFERENCES product(product_id),
    FOREIGN KEY (wishlist_id) REFERENCES wishlist(wishlist_id)
);

CREATE TABLE product_discount (
    product_id BIGINT,
    discount_code VARCHAR(255),
    amount NUMERIC(7, 2) NOT NULL,
    PRIMARY KEY (product_id, discount_code),
    FOREIGN KEY (product_id) REFERENCES product(product_id),
    FOREIGN KEY (discount_code) REFERENCES discount(discount_code),
    CONSTRAINT amount_constraint CHECK ( amount > 0 )
);

CREATE TABLE product_attachment (
    product_attachment_id BIGSERIAL PRIMARY KEY,
    attachment_url VARCHAR(255) NOT NULL,
    product_id BIGINT,
    FOREIGN KEY (product_id) REFERENCES product(product_id)
);

CREATE TABLE recommendation_product (
    recommendation_id BIGINT,
    product_id BIGINT,
    PRIMARY KEY (recommendation_id, product_id),
    FOREIGN KEY (recommendation_id) REFERENCES recommendation(recommendation_id),
    FOREIGN KEY (product_id) REFERENCES product(product_id)
);

CREATE TABLE recommendation_user (
    recommendation_id BIGINT,
    user_id BIGINT,
    PRIMARY KEY (recommendation_id, user_id),
    FOREIGN KEY (recommendation_id) REFERENCES recommendation(recommendation_id),
    FOREIGN KEY (user_id) REFERENCES userr(user_id)
);

CREATE TABLE purchase (
    timestamp TIMESTAMP,
    user_id BIGINT,
    card_id BIGINT,
    street VARCHAR(255),
    postal_code VARCHAR(255),
    PRIMARY KEY (user_id, card_id, street, postal_code, timestamp),
    FOREIGN KEY (user_id) REFERENCES userr(user_id),
    FOREIGN KEY (card_id) REFERENCES card(card_id),
    FOREIGN KEY (street, postal_code) REFERENCES address(street, postal_code)
);

CREATE TABLE purchase_history (
    user_id BIGINT,
    postal_code VARCHAR(255),
    street VARCHAR(255),
    card_id BIGINT,
    product_id BIGINT,
    timestamp TIMESTAMP,
    PRIMARY KEY (user_id, postal_code, street, card_id, product_id, timestamp),
    FOREIGN KEY (product_id) REFERENCES product(product_id),
    FOREIGN KEY (user_id, card_id, street, postal_code, timestamp) REFERENCES purchase(user_id, card_id, street, postal_code, timestamp)
);

CREATE TABLE ticket_attachment (
    ticket_attachment_id BIGSERIAL PRIMARY KEY,
    attachment_url VARCHAR(255) NOT NULL,
    ticket_id BIGINT,
    FOREIGN KEY (ticket_id) REFERENCES ticket(ticket_id)
);

ALTER TABLE address
    ADD COLUMN user_id BIGINT NOT NULL REFERENCES userr(user_id);

ALTER TABLE card
    ADD COLUMN user_id BIGINT NOT NULL REFERENCES userr(user_id);

ALTER TABLE message
    ADD COLUMN ticket_id BIGINT NOT NULL REFERENCES ticket(ticket_id),
    ADD COLUMN user_id BIGINT NOT NULL REFERENCES userr(user_id),
    ADD COLUMN timestamp TIMESTAMP NOT NULL;

ALTER TABLE ticket
    ADD COLUMN user_id BIGINT NOT NULL REFERENCES userr(user_id);

ALTER TABLE wishlist
    ADD COLUMN user_id BIGINT NOT NULL REFERENCES userr(user_id);

ALTER TABLE product
    ADD CONSTRAINT price_constraint CHECK ( price >= 0 )



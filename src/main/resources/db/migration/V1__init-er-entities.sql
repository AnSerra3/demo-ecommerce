CREATE TABLE userr (
    user_id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,  -- encoded
    country VARCHAR(255),
    date_of_birth DATE NOT NULL,
    fiscal_code VARCHAR(255) UNIQUE,
    phone_number VARCHAR(255) UNIQUE,
    gender VARCHAR(255),
    role VARCHAR(255) NOT NULL,
    CONSTRAINT gender_constraint CHECK ( gender in ('male', 'female', 'other') ),
    CONSTRAINT role_constraint CHECK ( role in ('admin', 'user') )
);

CREATE INDEX index_userr_email ON userr (email);

CREATE TABLE product (
    product_id BIGSERIAL PRIMARY KEY,
    category VARCHAR(255) NOT NULL,
    price NUMERIC(7, 2) NOT NULL,
    name VARCHAR(255) NOT NULL,
    quantity_in_stock INT NOT NULL,
    quantity_sold INT NOT NULL,
    description TEXT NOT NULL,
    CONSTRAINT quantity_in_stock_constraint CHECK ( quantity_in_stock >= 0 ),
    CONSTRAINT quantity_sold_constraint CHECK ( quantity_sold >= 0 )
);

CREATE TABLE discount (
    discount_code VARCHAR(255) PRIMARY KEY
);

CREATE TABLE recommendation (
    recommendation_id BIGSERIAL PRIMARY KEY,
    type VARCHAR(255) NOT NULL
);

CREATE TABLE address (
    postal_code VARCHAR(255),
    street VARCHAR(255),
    city VARCHAR(255) NOT NULL,
    country VARCHAR(255) NOT NULL,
    PRIMARY KEY (postal_code, street)
);

CREATE TABLE card (
    card_id BIGSERIAL PRIMARY KEY,
    card_number VARCHAR(255) NOT NULL, -- encoded
    name_on_card VARCHAR(255) NOT NULL,
    cvv VARCHAR(255) NOT NULL, -- encoded
    expiration VARCHAR(255) NOT NULL -- encoded
);

CREATE TABLE billing (
    postal_code VARCHAR(255),
    street VARCHAR(255),
    card_id BIGINT,
    PRIMARY KEY (postal_code, street, card_id),
    FOREIGN KEY (card_id) REFERENCES card(card_id),
    FOREIGN KEY (postal_code, street) REFERENCES address(postal_code, street)
);

CREATE TABLE ticket (
    ticket_id BIGSERIAL PRIMARY KEY,
    message TEXT NOT NULL,
    category VARCHAR(255) NOT NULL,
    timestamp TIMESTAMP NOT NULL,
    closed BOOLEAN NOT NULL DEFAULT FALSE,
    title VARCHAR(255) NOT NULL
);

CREATE TABLE message (
    message_id BIGSERIAL PRIMARY KEY,
    content TEXT NOT NULL
);

CREATE TABLE wishlist (
    wishlist_id BIGSERIAL PRIMARY KEY,
    description TEXT NOT NULL,
    name VARCHAR(255) NOT NULL
)
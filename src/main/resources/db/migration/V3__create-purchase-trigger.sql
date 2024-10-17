-- TODO test this trigger

CREATE OR REPLACE FUNCTION purchase_trigger_function()
    RETURNS TRIGGER AS $$
DECLARE
    cart_row RECORD;
BEGIN
    FOR cart_row IN
        SELECT quantity, product_id
        FROM cart_product
        WHERE user_id = NEW.user_id
        LOOP
            INSERT INTO purchase_history (
                user_id, postal_code, street, card_id, product_id, timestamp, quantity
            ) VALUES (
                         NEW.user_id, NEW.postal_code, NEW.street, NEW.card_id, cart_row.product_id, NEW.timestamp, cart_row.quantity
                     );
            DELETE FROM cart_product
            WHERE user_id = NEW.user_id AND product_id = cart_row.product_id;
        END LOOP;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER purchase_trigger
    AFTER INSERT ON purchase
    FOR EACH ROW
EXECUTE FUNCTION purchase_trigger_function();

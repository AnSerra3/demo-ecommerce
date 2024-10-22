ALTER SEQUENCE userr_user_id_seq RESTART WITH 1;

INSERT INTO userr (name, password, date_of_birth, email, fiscal_code, phone_number, country, role, gender)
VALUES
    ('John Doe', 'pass123', '1985-01-15', 'john.doe@example.com', 'ABC123XYZ', '1234567890', 'USA', 'user', 'male'),
    ('Jane Smith', 'password456', '1990-03-22', 'jane.smith@example.com', 'XYZ789ABC', '0987654321', 'Canada', 'user', 'female'),
    ('Alex Johnson', 'pass789', '1992-06-17', 'alex.johnson@example.com', 'QWERTY456', '1122334455', 'UK', 'user', 'other'),
    ('Emily Davis', 'emilypass', '1988-11-09', 'emily.davis@example.com', 'ASDFG5678', '2233445566', 'USA', 'user', 'female'),
    ('Michael Brown', 'mikepass', '1995-08-25', 'michael.brown@example.com', 'ZXC9876VC', '3344556677', 'Australia', 'user', 'male'),
    ('Sarah Wilson', 'wilson123', '1982-02-14', 'sarah.wilson@example.com', 'RTYUI1234', '5566778899', 'Germany', 'user', 'female'),
    ('Chris Taylor', 'chrispass', '1991-07-30', 'chris.taylor@example.com', 'HJKL7890M', '6677889900', 'France', 'user', 'other'),
    ('Olivia White', 'oliviapass', '1987-12-05', 'olivia.white@example.com', 'GHJKL4567', '7788990011', 'Italy', 'user', 'female'),
    ('David Lee', 'davidpass', '1993-04-19', 'david.lee@example.com', 'ZXCVB2345', '8899001122', 'South Korea', 'user', 'male'),
    ('Sophia Clark', 'sophiapass', '1989-09-10', 'sophia.clark@example.com', 'TYUIO5678', '9900112233', 'Japan', 'user', 'female'),
    ('Daniel Walker', 'danielpass', '1996-05-11', 'daniel.walker@example.com', 'WERTY7890', '1011121314', 'Brazil', 'user', 'male'),
    ('Isabella Hall', 'isabellapass', '1984-03-18', 'isabella.hall@example.com', 'UIO98765T', '1213141516', 'Mexico', 'user', 'female');

INSERT INTO product (name, category, quantity_in_stock, quantity_sold, description, price)
VALUES
    ('Wireless Mouse', 'Electronics', 50, 200, 'Ergonomic wireless mouse with precision tracking.', 29.99),
    ('Laptop Stand', 'Office Supplies', 0, 150, 'Adjustable laptop stand for better posture.', 39.99),
    ('Bluetooth Headphones', 'Electronics', 100, 400, 'Noise-cancelling Bluetooth headphones with long battery life.', 89.99),
    ('Running Shoes', 'Footwear', 20, 300, 'Comfortable running shoes for daily workouts.', 59.99),
    ('Yoga Mat', 'Fitness', 200, 50, 'Non-slip yoga mat for all types of exercise.', 24.99),
    ('Smartphone', 'Electronics', 0, 500, 'Latest model smartphone with 128GB storage.', 699.99),
    ('Desk Lamp', 'Office Supplies', 120, 100, 'LED desk lamp with adjustable brightness.', 19.99),
    ('Gaming Keyboard', 'Electronics', 15, 450, 'Mechanical gaming keyboard with RGB lighting.', 79.99),
    ('Coffee Maker', 'Home Appliances', 30, 250, 'Automatic coffee maker with programmable settings.', 49.99),
    ('Electric Kettle', 'Home Appliances', 80, 120, 'Fast boiling electric kettle with temperature control.', 29.99),
    ('Action Figure', 'Toys', 300, 20, 'Limited edition superhero action figure.', 14.99),
    ('Scented Candle', 'Home Decor', 500, 150, 'Relaxing lavender scented candle.', 12.99),
    ('Winter Jacket', 'Apparel', 10, 350, 'Waterproof winter jacket with insulated lining.', 129.99),
    ('Tennis Racket', 'Sports', 25, 100, 'Professional-grade tennis racket for all skill levels.', 79.99),
    ('Phone Charger', 'Electronics', 1000, 600, 'Fast-charging phone charger with USB-C connector.', 14.99),
    ('Cooking Pan Set', 'Kitchenware', 40, 180, 'Non-stick cooking pan set with heat-resistant handles.', 69.99),
    ('Fitness Tracker', 'Electronics', 75, 320, 'Fitness tracker with heart rate monitor and GPS.', 99.99),
    ('Book: Modern Java', 'Books', 60, 90, 'Comprehensive guide to modern Java programming.', 29.99),
    ('Air Purifier', 'Home Appliances', 0, 200, 'Air purifier with HEPA filter for clean air.', 129.99),
    ('Socks (5-pack)', 'Apparel', 400, 450, 'Comfortable cotton socks in assorted colors.', 9.99),
    ('Water Bottle', 'Fitness', 300, 100, 'Insulated stainless steel water bottle, 1L.', 19.99),
    ('Bluetooth Speaker', 'Electronics', 150, 300, 'Portable Bluetooth speaker with deep bass.', 49.99),
    ('Desk Organizer', 'Office Supplies', 250, 50, 'Multi-compartment desk organizer for office supplies.', 14.99),
    ('Notebook', 'Stationery', 1000, 600, 'Hardcover notebook with ruled pages.', 7.99),
    ('Electric Scooter', 'Electronics', 10, 50, 'Electric scooter with 25km range and foldable design.', 499.99),
    ('Sunglasses', 'Accessories', 80, 250, 'Polarized sunglasses with UV protection.', 29.99),
    ('Frying Pan', 'Kitchenware', 60, 90, 'Non-stick frying pan, 12-inch diameter.', 24.99),
    ('Vacuum Cleaner', 'Home Appliances', 15, 100, 'Cordless vacuum cleaner with powerful suction.', 179.99),
    ('Bicycle Helmet', 'Sports', 45, 80, 'Safety-certified bicycle helmet for adults.', 39.99),
    ('Leather Wallet', 'Accessories', 120, 150, 'Genuine leather wallet with multiple card slots.', 49.99),
    ('Electric Toothbrush', 'Personal Care', 200, 500, 'Rechargeable electric toothbrush with 3 modes.', 39.99),
    ('Baby Stroller', 'Baby Products', 5, 60, 'Lightweight baby stroller with adjustable seat.', 249.99),
    ('Basketball', 'Sports', 80, 180, 'Official size basketball with superior grip.', 29.99),
    ('Laptop Backpack', 'Accessories', 90, 200, 'Water-resistant laptop backpack with padded compartments.', 59.99),
    ('Wireless Charger', 'Electronics', 150, 300, 'Qi-certified wireless charger for smartphones.', 19.99),
    ('Wristwatch', 'Accessories', 30, 75, 'Classic wristwatch with leather strap and quartz movement.', 79.99),
    ('Sleeping Bag', 'Outdoor', 20, 50, 'Lightweight sleeping bag for camping and hiking.', 69.99),
    ('BBQ Grill', 'Outdoor', 8, 40, 'Charcoal BBQ grill with adjustable heat control.', 129.99),
    ('Electric Blanket', 'Home Appliances', 50, 80, 'Electric blanket with dual-zone heating control.', 59.99),
    ('Shampoo (500ml)', 'Personal Care', 1000, 800, 'Sulfate-free moisturizing shampoo.', 9.99),
    ('Gaming Console', 'Electronics', 0, 1000, 'Next-gen gaming console with 1TB storage.', 499.99),
    ('Toaster', 'Kitchenware', 120, 200, '4-slice toaster with browning control.', 29.99),
    ('Running Shorts', 'Apparel', 60, 150, 'Breathable running shorts with moisture-wicking fabric.', 19.99),
    ('Electric Drill', 'Tools', 45, 100, 'Cordless electric drill with rechargeable battery.', 89.99),
    ('Smartwatch', 'Electronics', 30, 400, 'Smartwatch with fitness tracking and notifications.', 199.99),
    ('Hair Dryer', 'Personal Care', 120, 300, 'Fast-drying hair dryer with multiple heat settings.', 49.99),
    ('Hand Mixer', 'Kitchenware', 80, 150, 'Electric hand mixer with 5-speed settings.', 24.99),
    ('Laptop', 'Electronics', 5, 250, 'High-performance laptop with 16GB RAM and 512GB SSD.', 999.99),
    ('Wireless Earbuds', 'Electronics', 300, 600, 'True wireless earbuds with noise-cancellation.', 129.99),
    ('Sneakers', 'Footwear', 200, 400, 'Stylish sneakers with cushioned insoles.', 69.99),
    ('Iron', 'Home Appliances', 100, 200, 'Steam iron with anti-drip and self-cleaning features.', 39.99),
    ('Action Camera', 'Electronics', 20, 75, 'Waterproof action camera with 4K video recording.', 199.99),
    ('Portable Hard Drive', 'Electronics', 150, 300, '1TB portable hard drive with USB 3.0.', 79.99),
    ('Portable Charger', 'Electronics', 300, 500, '10,000mAh portable charger with fast charging support.', 29.99),
    ('Board Game', 'Toys', 80, 300, 'Family-friendly board game for 2-4 players.', 24.99),
    ('Smart Light Bulb', 'Home Appliances', 200, 150, 'WiFi-enabled smart light bulb with voice control.', 14.99),
    ('Cookbook', 'Books', 60, 120, 'Healthy recipes for everyday meals.', 19.99),
    ('Digital Camera', 'Electronics', 10, 90, 'Compact digital camera with 20MP resolution.', 149.99),
    ('Trekking Poles', 'Outdoor', 40, 75, 'Lightweight trekking poles for hiking.', 49.99),
    ('Pillow Set', 'Home Decor', 500, 200, 'Memory foam pillow set for a good night sleep.', 39.99),
    ('Electric Pressure Cooker', 'Kitchenware', 25, 140, '6-in-1 electric pressure cooker with safety features.', 89.99),
    ('Waterproof Jacket', 'Apparel', 100, 250, 'Lightweight waterproof jacket for rainy days.', 79.99),
    ('Garden Tools Set', 'Outdoor', 60, 100, 'Essential garden tools set for beginners.', 39.99),
    ('Sunglasses Case', 'Accessories', 300, 50, 'Protective case for sunglasses.', 9.99),
    ('Wireless Mouse Pad', 'Office Supplies', 200, 180, 'Mouse pad with wireless charging capabilities.', 29.99),
    ('Camping Tent', 'Outdoor', 10, 40, '2-person camping tent with waterproof cover.', 129.99),
    ('Fragrance Diffuser', 'Home Decor', 100, 80, 'Essential oil fragrance diffuser with LED lighting.', 19.99),
    ('Mechanical Pencil Set', 'Stationery', 400, 350, 'Set of 3 mechanical pencils with refill leads.', 12.99),
    ('Thermal Mug', 'Fitness', 300, 250, 'Vacuum-insulated thermal mug for hot and cold drinks.', 19.99),
    ('Leather Belt', 'Apparel', 80, 150, 'Adjustable leather belt with metal buckle.', 29.99),
    ('Yoga Ball', 'Fitness', 150, 200, 'Anti-burst yoga ball for exercise and stretching.', 24.99),
    ('Drill Bit Set', 'Tools', 60, 80, 'High-speed drill bit set for various surfaces.', 29.99),
    ('Baby Monitor', 'Baby Products', 20, 60, 'Baby monitor with video and audio capabilities.', 79.99),
    ('Vacuum Sealer', 'Home Appliances', 15, 40, 'Food vacuum sealer with multiple modes.', 59.99),
    ('Coffee Grinder', 'Kitchenware', 70, 100, 'Electric coffee grinder with stainless steel blades.', 29.99),
    ('Pet Bed', 'Pet Supplies', 200, 130, 'Comfortable pet bed for dogs and cats.', 39.99),
    ('Adjustable Dumbbells', 'Fitness', 50, 90, 'Set of adjustable dumbbells with quick weight changes.', 159.99),
    ('Table Lamp', 'Home Decor', 180, 250, 'Modern table lamp with touch controls.', 49.99),
    ('Bluetooth Keyboard', 'Electronics', 100, 200, 'Slim Bluetooth keyboard for tablets and phones.', 29.99),
    ('Puzzle Game', 'Toys', 150, 300, '500-piece jigsaw puzzle for all ages.', 14.99),
    ('Electric Bike', 'Outdoor', 5, 30, 'Electric bike with pedal assist and 50km range.', 999.99),
    ('Action Novel', 'Books', 90, 200, 'Thrilling action novel by bestselling author.', 14.99),
    ('Ceramic Vase', 'Home Decor', 300, 100, 'Handmade ceramic vase for flowers.', 24.99);

INSERT INTO address (street, postal_code, country, city, user_id)
VALUES
-- User 1: John Doe (USA) - 2 addresses
('456 Walnut St', '10002', 'USA', 'New York', 1),
('789 Pine St', '10112', 'USA', 'Boston', 1),

-- User 2: Jane Smith (Canada) - 3 addresses
('321 Maple Ave', 'M4B1B4', 'Canada', 'Toronto', 2),
('678 Oak St', 'H2Y1J2', 'Canada', 'Montreal', 2),
('999 Birch Rd', 'V5K1Z3', 'Canada', 'Vancouver', 2),

-- User 3: Alex Johnson (UK) - 0 addresses
-- No records for Alex

-- User 4: Emily Davis (USA) - 1 address
('789 Elm St', '60614', 'USA', 'Chicago', 4),

-- User 5: Michael Brown (Australia) - 3 addresses
('123 Kangaroo St', '2000', 'Australia', 'Sydney', 5),
('456 Koala Ave', '3000', 'Australia', 'Melbourne', 5),
('789 Platypus Ln', '4000', 'Australia', 'Brisbane', 5),

-- User 6: Sarah Wilson (Germany) - 2 addresses
('78 Lindenstrasse', '10115', 'Germany', 'Berlin', 6),
('90 Hauptstrasse', '80331', 'Germany', 'Munich', 6),

-- User 7: Chris Taylor (France) - 0 addresses
-- No records for Chris

-- User 8: Olivia White (Italy) - 1 address
('12 Via Roma', '00184', 'Italy', 'Rome', 8),

-- User 9: David Lee (South Korea) - 3 addresses
('56 Han River Rd', '04524', 'South Korea', 'Seoul', 9),
('99 Gangnam Blvd', '06164', 'South Korea', 'Seoul', 9),
('77 Jeju St', '63122', 'South Korea', 'Jeju', 9),

-- User 10: Sophia Clark (Japan) - 1 address
('4-2-8 Ginza', '104-0061', 'Japan', 'Tokyo', 10),

-- User 11: Daniel Walker (Brazil) - 2 addresses
('789 Avenida Paulista', '01311-200', 'Brazil', 'São Paulo', 11),
('123 Copacabana Beach', '22021-001', 'Brazil', 'Rio de Janeiro', 11);

-- User 12: Isabella Hall (Mexico) - 0 addresses
-- No records for Isabella

INSERT INTO card (name_on_card, card_number, cvv, expiration, user_id)
VALUES
-- User 1: John Doe - 3 cards
('John Doe', '4111-1111-1111-1111', '123', '2025-12-31', 1),
('John Doe', '5500-0000-0000-0004', '456', '2026-06-30', 1),
('John Doe', '3400-0000-0000-009', '789', '2024-11-30', 1),

-- User 2: Jane Smith - 1 card
('Jane Smith', '6011-0000-0000-0004', '321', '2025-01-15', 2),

-- User 3: Alex Johnson - 2 cards
('Alex Johnson', '4000-0000-0000-0002', '987', '2025-03-18', 3),
('Alex Johnson', '3000-0000-0000-0001', '654', '2025-05-30', 3),

-- User 4: Emily Davis - 0 cards
-- No cards for Emily Davis

-- User 5: Michael Brown - 1 card
('Michael Brown', '5105-1051-0510-5100', '123', '2026-05-12', 5),

-- User 6: Sarah Wilson - 1 card
('Sarah Wilson', '6011-0000-0000-0005', '321', '2024-10-01', 6),

-- User 7: Chris Taylor - 0 cards
-- No cards for Chris Taylor

-- User 8: Olivia White - 1 card
('Olivia White', '5500-0000-0000-0004', '789', '2026-09-15', 8),

-- User 9: David Lee - 2 cards, 1 address
('David Lee', '4111-1111-1111-1111', '123', '2025-01-20', 9),
('David Lee', '6011-0000-0000-0005', '234', '2024-05-25', 9),

-- User 10: Sophia Clark - 0 cards
-- No cards for Sophia Clark

-- User 11: Daniel Walker - 2 cards
('Daniel Walker', '2200-0000-0000-0007', '678', '2024-04-10', 11),
('Daniel Walker', '5105-1051-0510-5100', '789', '2025-11-15', 11),

-- User 12: Isabella Hall - 1 card, 0 addresses
('Isabella Hall', '4000-0000-0000-0004', '999', '2025-02-28', 12);

INSERT INTO billing (street, postal_code, card_id)
VALUES
-- User 1: John Doe - 3 cards, 2 addresses
('456 Walnut St', '10002', 1),  -- Card 1
('456 Walnut St', '10002', 2),  -- Card 2
('789 Pine St', '10112', 1),    -- Card 1
('789 Pine St', '10112', 2),    -- Card 2
('456 Walnut St', '10002', 3),  -- Card 3
('789 Pine St', '10112', 3),    -- Card 3

-- User 2: Jane Smith - 1 card, 3 addresses
('321 Maple Ave', 'M4B1B4', 4),  -- Card 1
('678 Oak St', 'H2Y1J2', 4),     -- Card 1
('999 Birch Rd', 'V5K1Z3', 4),   -- Card 1

-- User 3: Alex Johnson - 2 cards, 0 addresses
-- No billings for Alex as he has no addresses

-- User 4: Emily Davis - 0 cards, 1 address
-- No billings for Emily as she has no cards

-- User 5: Michael Brown - 1 card, 3 addresses
('123 Kangaroo St', '2000', 5),  -- Card 1
('456 Koala Ave', '3000', 5),     -- Card 1
('789 Platypus Ln', '4000', 5),   -- Card 1

-- User 6: Sarah Wilson - 1 card, 2 addresses
('78 Lindenstrasse', '10115', 6),  -- Card 1
('90 Hauptstrasse', '80331', 6),    -- Card 1

-- User 7: Chris Taylor - 0 cards, 0 addresses
-- No billings for Chris as he has no cards or addresses

-- User 8: Olivia White - 1 card, 1 address
('12 Via Roma', '00184', 7),       -- Card 1

-- User 9: David Lee - 2 cards, 3 addresses
('56 Han River Rd', '04524', 8),   -- Card 1
('56 Han River Rd', '04524', 9),   -- Card 2
('99 Gangnam Blvd', '06164', 8),    -- Card 1
('99 Gangnam Blvd', '06164', 9),    -- Card 2
('77 Jeju St', '63122', 8),         -- Card 1
('77 Jeju St', '63122', 9),         -- Card 2

-- User 10: Sophia Clark - 0 cards, 1 address
-- No billings for Sophia as she has no cards

-- User 11: Daniel Walker - 2 cards, 2 addresses
('789 Avenida Paulista', '01311-200', 10),  -- Card 1
('789 Avenida Paulista', '01311-200', 11),  -- Card 2
('123 Copacabana Beach', '22021-001', 10),   -- Card 1
('123 Copacabana Beach', '22021-001', 11);   -- Card 2

-- User 12: Isabella Hall - 1 card, 0 addresses
-- No billings for Isabella as she has no addresses

INSERT INTO discount (discount_code)
VALUES
('SALE20');

INSERT INTO product_discount (product_id, discount_code, amount)
VALUES
(1, 'SALE20', 20),
(5, 'SALE20', 20),
(3, 'SALE20', 20),
(24, 'SALE20', 20),
(56, 'SALE20', 20),
(6, 'SALE20', 20),
(53, 'SALE20', 20),
(9, 'SALE20', 20),
(31, 'SALE20', 20),
(29, 'SALE20', 20),
(79, 'SALE20', 20),
(12, 'SALE20', 20);

INSERT INTO product_attachment (attachment_url, product_id)
VALUES
    ('../../static/images/template.png', 1),
    ('../../static/images/template.png', 2),
    ('../../static/images/template.png', 3),
    ('../../static/images/template.png', 4),
    ('../../static/images/template.png', 5),
    ('../../static/images/template.png', 6),
    ('../../static/images/template.png', 7),
    ('../../static/images/template.png', 8),
    ('../../static/images/template.png', 9),
    ('../../static/images/template.png', 10),
    ('../../static/images/template.png', 11),
    ('../../static/images/template.png', 12),
    ('../../static/images/template.png', 13),
    ('../../static/images/template.png', 14),
    ('../../static/images/template.png', 15),
    ('../../static/images/template.png', 16),
    ('../../static/images/template.png', 17),
    ('../../static/images/template.png', 18),
    ('../../static/images/template.png', 19),
    ('../../static/images/template.png', 20),
    ('../../static/images/template.png', 21),
    ('../../static/images/template.png', 22),
    ('../../static/images/template.png', 23),
    ('../../static/images/template.png', 24),
    ('../../static/images/template.png', 25),
    ('../../static/images/template.png', 26),
    ('../../static/images/template.png', 27),
    ('../../static/images/template.png', 28),
    ('../../static/images/template.png', 29),
    ('../../static/images/template.png', 30),
    ('../../static/images/template.png', 31),
    ('../../static/images/template.png', 32),
    ('../../static/images/template.png', 33),
    ('../../static/images/template.png', 34),
    ('../../static/images/template.png', 35),
    ('../../static/images/template.png', 36),
    ('../../static/images/template.png', 37),
    ('../../static/images/template.png', 38),
    ('../../static/images/template.png', 39),
    ('../../static/images/template.png', 40),
    ('../../static/images/template.png', 41),
    ('../../static/images/template.png', 42),
    ('../../static/images/template.png', 43),
    ('../../static/images/template.png', 44),
    ('../../static/images/template.png', 45),
    ('../../static/images/template.png', 46),
    ('../../static/images/template.png', 47),
    ('../../static/images/template.png', 48),
    ('../../static/images/template.png', 49),
    ('../../static/images/template.png', 50),
    ('../../static/images/template.png', 51),
    ('../../static/images/template.png', 52),
    ('../../static/images/template.png', 53),
    ('../../static/images/template.png', 54),
    ('../../static/images/template.png', 55),
    ('../../static/images/template.png', 56),
    ('../../static/images/template.png', 57),
    ('../../static/images/template.png', 58),
    ('../../static/images/template.png', 59),
    ('../../static/images/template.png', 60),
    ('../../static/images/template.png', 61),
    ('../../static/images/template.png', 62),
    ('../../static/images/template.png', 63),
    ('../../static/images/template.png', 64),
    ('../../static/images/template.png', 65),
    ('../../static/images/template.png', 66),
    ('../../static/images/template.png', 67),
    ('../../static/images/template.png', 68),
    ('../../static/images/template.png', 69),
    ('../../static/images/template.png', 70),
    ('../../static/images/template.png', 71),
    ('../../static/images/template.png', 72),
    ('../../static/images/template.png', 73),
    ('../../static/images/template.png', 74),
    ('../../static/images/template.png', 75),
    ('../../static/images/template.png', 76),
    ('../../static/images/template.png', 77),
    ('../../static/images/template.png', 78),
    ('../../static/images/template.png', 79),
    ('../../static/images/template.png', 80),
    ('../../static/images/template.png', 81),
    ('../../static/images/template.png', 82),
    ('../../static/images/template.png', 83)









-- CREATE database PRODUK;



CREATE TABLE tblStore_Products(
    Product_no INT PRIMARY KEY auto_increment NOT NULL,
    Product_name varchar(50) not null,
    Product_type varchar(50) not null,
    Price float(2) not null,
	Expiration_date date not null
);


INSERT INTO tblStore_Products ( Product_Name, Product_Type, Price, Expiration_Date)

VALUES
( 'Lollipop', 'Candy', 2.00, '2025-12-31'),
( 'Century', 'Canned goods', 35.00, '2025-05-01'),
( 'Pepsi', 'Softdrinks/Drinks', 20.00, '2024-10-01'),
( 'Rebisco', 'Biscuits', 10.00, '2024-06-15'),
( 'Ketchup', 'Condiments', 25.00, '2025-08-12'),
( 'Red Horse', 'Alcohol', 135.00, '2026-03-01'),
( 'Toothpaste', 'Oral Care', 10.00, '2026-01-01'),
( 'Chip', 'Snack Food', 10.00, '2024-11-15'),
( 'Magic Sarap', 'Seasoning', 5.00, '2026-07-20'),
( 'Ariel', 'Cleaning Product', 9.00, '2025-11-30'),
( 'Syrup', 'Sweetener', 50.00, '2024-12-10'),
( 'Paper Towels', 'Paper Product', 20.00, '2025-05-01'),
( 'Baking Soda', 'Baking Ingredients', 30.00, '2026-09-15'),
( 'Butter', 'Dairy Product', 45.00, '2024-12-31'),
( 'Sesame Oil', 'Culinary Ingredients', 40.00, '2025-02-10'),
( 'Noodles', 'Convenience Food', 25.00, '2024-11-05'),
( 'Nescafe coffee', 'Beverage', 2.50, '2025-09-30'),
( 'Eggs', 'Perishable Food', 10.00, '2024-10-25'),
( 'Peanut Butter', 'Spread', 30.00, '2025-07-15'),
( 'Pasta', 'Dry Goods', 100.00, '2025-03-10'),
( 'Baby Diapers', 'Baby Care', 10.00, '2025-11-05'),
( 'Plastic Bags', 'Household Item', 15.00, '2024-12-05'),
( 'Ice Cream', 'Frozen Dessert', 25.00, '2024-11-20'),
( 'Marshmallows', 'Confectionary', 10.00, '2024-12-01'),
( 'Surf', 'Cleaning Product', 10.00, '2025-04-15');



SELECT * FROM produk.tblstore_products;


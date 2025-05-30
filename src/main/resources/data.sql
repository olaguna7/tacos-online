//delete from Taco_Order_Tacos;
//delete from Taco_Ingredients;
//delete from Taco;
//delete from Taco_Order;

//delete from Ingredient;


insert into Ingredient (id, name, type)
                values ('FLTO', 'Flour Tortilla', 'WRAP');
insert into Ingredient (id, name, type)
                values ('COTO', 'Corn Tortilla', 'WRAP');
insert into Ingredient (id, name, type)
                values ('GRBF', 'Ground Beef', 'PROTEIN');
insert into Ingredient (id, name, type)
                values ('CARN', 'Carnitas', 'PROTEIN');
insert into Ingredient (id, name, type)
                values ('TMTO', 'Diced Tomatoes', 'VEGGIES');
insert into Ingredient (id, name, type)
                values ('LETC', 'Lettuce', 'VEGGIES');
insert into Ingredient (id, name, type)
                values ('CHED', 'Cheddar', 'CHEESE');
insert into Ingredient (id, name, type)
                values ('JACK', 'Monterrey Jack', 'CHEESE');
insert into Ingredient (id, name, type)
                values ('SLSA', 'Salsa', 'SAUCE');
insert into Ingredient (id, name, type)
                values ('SRCR', 'Sour Cream', 'SAUCE');

INSERT INTO Usuario VALUES
                         (1, 'john@gmail.com', 'john', '$2a$12$.DNBDk4w3VlG6Fn3sNmUOeCw6VXuVa7O3oDCfvRrfMucwMn5VthQK','john'),
                         (2,'sam@gmail.com','sam','$2a$12$FujPv5E0QKVRVt1zIIu3GuTMxkvLs9dEgTQOx0z8WYfyjYJAZF0Zm','sam');


INSERT INTO Roles VALUES (1,'ROLE_USER'),(2,'ROLE_ADMIN');

INSERT INTO Usuario_Roles VALUES (1,1),(2,2);
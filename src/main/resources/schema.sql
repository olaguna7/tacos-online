create table if not exists Ingredient (
  id varchar(4) not null primary key,
  name varchar(25) not null,
  type varchar(10) not null
);

create table if not exists Taco (
  id identity,
  name varchar(50) not null,
  created_at timestamp not null
);

create table if not exists Taco_Ingredients (
  taco_id bigint not null,
  ingredients_id varchar(4) not null,
  foreign key (taco_id) references Taco(id),
  foreign key (ingredients_id) references Ingredient(id)
);


create table if not exists Taco_Order (
  id identity,
    delivery_name varchar(50) not null,
    delivery_street varchar(50) not null,
    delivery_city varchar(50) not null,
    delivery_state varchar(10) not null,
    delivery_zip varchar(10) not null,
    cc_number varchar(16) not null,
    cc_expiration varchar(5) not null,
    ccCVV varchar(3) not null,
    placed_at timestamp not null
);

create table if not exists Taco_Order_Tacos (
  order_id bigint not null,
  tacos_id bigint not null,
  foreign key (order_id) references Taco_Order(id),
  foreign key (tacos_id) references Taco(id)
);


create table if not exists Usuario (
    id identity,
    email varchar(25) not null,
    username varchar(25) not null,
    password varchar(255) not null,
    name varchar(10) not null
);

create table if not exists Roles (
    id identity,
    name varchar(50) not null
);

create table if not exists Usuario_Roles (
    user_id bigint not null,
    role_id bigint not null
);

alter table Usuario_Roles add foreign key (user_id) references Usuario(id);
alter table Usuario_Roles add foreign key (role_id) references Roles(id);


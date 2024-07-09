DROP SCHEMA IF EXISTS app CASCADE;

CREATE SCHEMA IF NOT EXISTS app;

SET SCHEMA 'app';

CREATE TABLE roles
(
    id          TEXT NOT NULL PRIMARY KEY,
    description TEXT NOT NULL
);

CREATE TABLE users
(
    id        SERIAL PRIMARY KEY,
    full_name TEXT UNIQUE NOT NULL,
    password  TEXT        NOT NULL,
    email     TEXT UNIQUE NOT NULL,
    role_id   TEXT REFERENCES roles (id)
);

CREATE TABLE waste_category
(
    id          TEXT PRIMARY KEY NOT NULL,
    description TEXT             NOT NULL
);

INSERT INTO waste_category (id, description)
VALUES ('PAPER', 'Newspapers, Magazines, Office paper, Cardboard'),
       ('GLASS', 'Glass bottles, Glass jars'),
       ('PLASTIC',
        'Water bottles (PET), Soda bottles (PET), Milk jugs (HDPE), Shampoo bottles (HDPE and PET), Yogurt containers (PP), Plastic bags (LDPE)'),
       ('METALS', 'Aluminum cans, Tin cans, Steel cans, Aluminum foil'),
       ('TEXTILES', 'Clothing, Bedding, Towels, Curtains'),
       ('ELECTRONICS', 'Computers, Mobile phones, TVs, Printers'),
       ('ORGANIC_WASTE', 'Food scraps, Yard waste (grass clippings, leaves), Compostable materials'),
       ('BATTERIES', 'Rechargeable batteries, Single-use batteries'),
       ('TIRES', 'Car tires, Bicycle tires'),
       ('CONSTRUCTION_MATERIALS', 'Bricks, Concrete, Wood'),
       ('CERAMICS', 'Windows, Dishes, Tiles, Porcelain');

CREATE TABLE disposal_guidlines
(
    id          TEXT PRIMARY KEY NOT NULL,
    description TEXT             NOT NULL
);

CREATE TABLE recycling_tips
(
    id          TEXT PRIMARY KEY NOT NULL,
    description TEXT             NOT NULL
);
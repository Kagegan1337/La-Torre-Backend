CREATE TABLE IF NOT EXISTS "languages"
(
    "language_id" integer,
    "iso_code"    varchar(255),
    PRIMARY KEY ("language_id")
);

CREATE TABLE IF NOT EXISTS "manufacturer"
(
    "manufacturer_id"   integer,
    "manufacturer_name" varchar(255),
    PRIMARY KEY ("manufacturer_id")
);

CREATE TABLE IF NOT EXISTS "pooling"
(
    "pooling_id"  integer,
    "description" varchar(255),
    PRIMARY KEY ("pooling_id")
);

CREATE TABLE IF NOT EXISTS "translation"
(
    "translation_id" integer,
    "language_id"    integer,
    "translation"    varchar(255),
    PRIMARY KEY ("translation_id"),
    CONSTRAINT fk_language FOREIGN KEY ("language_id") REFERENCES "languages" ("language_id")
);

CREATE TABLE IF NOT EXISTS "article"
(
    "article_id"      integer,
    "manufacturer_id" integer UNIQUE,
    "description_id"  integer UNIQUE,
    "base_price"      integer,
    "creation_date"   timestamp,
    PRIMARY KEY ("article_id"),
    CONSTRAINT fk_manucaturer FOREIGN KEY (manufacturer_id) REFERENCES "manufacturer" (manufacturer_id)
);

CREATE TABLE IF NOT EXISTS "description"
(
    "description_id" integer,
    "article_id"     integer,
    "translation_id" integer,
    PRIMARY KEY ("description_id"),
    CONSTRAINT fk_translation FOREIGN KEY ("translation_id") REFERENCES "translation" ("translation_id"),
    CONSTRAINT fk_article FOREIGN KEY ("article_id") REFERENCES article ("article_id")
);

CREATE TABLE IF NOT EXISTS "names"
(
    "name_id"        integer,
    "article_id"     integer,
    "translation_id" integer,
    PRIMARY KEY ("name_id"),
    CONSTRAINT fk_translation FOREIGN KEY ("translation_id") REFERENCES "translation" ("translation_id"),
    CONSTRAINT fk_article FOREIGN KEY ("article_id") REFERENCES article (article_id)
);

CREATE TABLE IF NOT EXISTS "pooling_article"
(
    "article_id" integer,
    "pooling_id" integer,
    "price"      integer,
    PRIMARY KEY ("article_id", "pooling_id"),
    CONSTRAINT fk_article FOREIGN KEY ("article_id") REFERENCES "article" ("article_id"),
    CONSTRAINT fk_pooling FOREIGN KEY ("pooling_id") REFERENCES "pooling" ("pooling_id")
);

INSERT INTO languages
VALUES (1, 'de-DE');
INSERT INTO languages
VALUES (2, 'en-EN');
INSERT INTO languages
VALUES (3, 'pt-PT');

INSERT INTO manufacturer
values (1, 'LaTorre');
INSERT INTO manufacturer
values (2, 'Kagegan');
INSERT INTO manufacturer
values (3, 'Miss Mellow');

INSERT INTO pooling
values (1, '1/8 Karton');
INSERT INTO pooling
values (2, '3/7 Karton');
INSERT INTO pooling
values (3, '5/9 Karton');

INSERT INTO translation
values (1, 1, 'salzig lecker');
INSERT INTO translation
values (2, 2, 'salty tasty');
INSERT INTO translation
values (3, 3, 'salgado saboroso');
INSERT INTO translation
values (4, 1, 'Chips DE');
INSERT INTO translation
values (5, 2, 'Chips EN');
INSERT INTO translation
values (6, 3, 'Chips PT');
INSERT INTO translation
values (7, 1, 'Foo DE');
INSERT INTO translation
values (8, 2, 'Foo EN');
INSERT INTO translation
values (9, 3, 'Foo PT');
INSERT INTO translation
values (10, 1, 'Bar DE');
INSERT INTO translation
values (11, 2, 'Bar EN');
INSERT INTO translation
values (12, 3, 'Bar PT');
INSERT INTO translation
values (13, 1, 'Foo lecker DE');
INSERT INTO translation
values (14, 2, 'Foo lecker EN');
INSERT INTO translation
values (15, 3, 'Foo lecker PT');
INSERT INTO translation
values (16, 1, 'Bar lecker DE');
INSERT INTO translation
values (17, 2, 'Bar lecker EN');
INSERT INTO translation
values (18, 3, 'Bar lecker PT');
INSERT INTO translation
values (19,1,'Fleisch');
INSERT INTO translation
values (20,2,'Meat');
INSERT INTO translation
values (21,3,'carne');
INSERT INTO translation
values (22,1,'Fisch');
INSERT INTO translation
values (23,2,'Fish');
INSERT INTO translation
values (24,3,'Peixe');
INSERT INTO translation
values (25,1,'Gemüse');
INSERT INTO translation
values (26,2,'Vegetables');
INSERT INTO translation
values (27,3,'Verduras');

INSERT INTO article values (1,1,1000,'1970-01-01');
INSERT INTO article values (2,2,1000,'1970-01-01');
INSERT INTO article values (3,3,1000,'1970-01-01');

INSERT INTO description values (1,1,1);
INSERT INTO description values (2,1,2);
INSERT INTO description values (3,1,3);
INSERT INTO description values (4,2,13);
INSERT INTO description values (5,2,14);
INSERT INTO description values (6,2,15);
INSERT INTO description values (7,3,16);
INSERT INTO description values (8,3,17);
INSERT INTO description values (9,3,18);

INSERT INTO names values (1,1,4);
INSERT INTO names values (2,1,5);
INSERT INTO names values (3,1,6);
INSERT INTO names values (4,2,7);
INSERT INTO names values (5,2,8);
INSERT INTO names values (6,2,9);
INSERT INTO names values (7,3,10);
INSERT INTO names values (8,3,11);
INSERT INTO names values (9,3,12);

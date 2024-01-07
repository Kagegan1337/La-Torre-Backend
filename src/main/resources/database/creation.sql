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


CREATE TABLE IF NOT EXISTS "pooling_description" (
    "pooling_description_id" integer,
    "pooling_id" integer,
    "translation_id" integer,
    CONSTRAINT fk_pooling FOREIGN KEY ("pooling_id") REFERENCES "pooling"("pooling_id"),
    CONSTRAINT fk_translation FOREIGN KEY ("translation_id") REFERENCES "translation"("translation_id")
);

CREATE TABLE IF NOT EXISTS "images" (
    "image_id" integer,
    "image_path" varchar(255),
    PRIMARY KEY ("image_id")
);

CREATE TABLE IF NOT EXISTS "article_image" (
    "image_id" integer,
    "article_id" integer,
    PRIMARY KEY ("image_id","article_id"),
    CONSTRAINT fk_image FOREIGN KEY ("image_id") REFERENCES images("image_id"),
    CONSTRAINT fk_article FOREIGN KEY ("article_id") REFERENCES article("article_id")
);
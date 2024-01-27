CREATE TABLE hotel
(
    id           UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name         VARCHAR(32)  NOT NULL,
    location     VARCHAR(128) NOT NULL,
    floors       SMALLINT     NOT NULL,
    contact_info VARCHAR(64)  NOT NULL
);



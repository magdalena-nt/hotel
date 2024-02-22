CREATE TABLE guest
(
    id      UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name    VARCHAR(32) NOT NULL,
    surname VARCHAR(32) NOT NULL,
    phone   VARCHAR(15) NOT NULL,
    email   VARCHAR(64) NOT NULL
);
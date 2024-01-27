CREATE TABLE employee
(
    id       UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name     VARCHAR(64)                NOT NULL,
    surname  VARCHAR(64)                NOT NULL,
    phone    VARCHAR(14)                NOT NULL,
    email    VARCHAR(32),
    job      VARCHAR(32)                NOT NULL,
    hotel_id UUID REFERENCES hotel (id) NOT NULL
);
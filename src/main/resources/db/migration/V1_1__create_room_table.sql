CREATE TABLE room
(
    id        UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    number    VARCHAR(3)                     NOT NULL,
    type      VARCHAR(32)                    NOT NULL,
    available BOOL             DEFAULT FALSE NOT NULL,
    hotel_id  UUID REFERENCES hotel (id)     NOT NULL
);
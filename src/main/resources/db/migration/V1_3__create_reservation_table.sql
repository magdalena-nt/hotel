CREATE TABLE reservation
(
    id             UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    check_in_date  DATE                           NOT NULL,
    check_out_date DATE                           NOT NULL,
    has_checked_in BOOLEAN          DEFAULT FALSE NOT NULL,
    room_id        UUID REFERENCES room (id)      NOT NULL,
    guest_id       UUID REFERENCES guest (id)     NOT NULL
);
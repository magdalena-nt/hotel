INSERT INTO public.hotel (id, name, location, floors, contact_info)
VALUES ('5e89334f-09ec-4382-884c-6209c70e4939', 'Grand Hotel', '123 Main Street, Cityville', 5, 'info@grandhotel.com');

INSERT INTO public.employee (id, name, surname, phone, email, job, hotel_id)
VALUES ('0d14ac06-3b69-408e-8719-2f716bd2b9dd', 'Anna', 'Nowak', '+48 111 333 777', 'anna.nowak@email.com',
        'serwis sprzątający', '5e89334f-09ec-4382-884c-6209c70e4939'),
       ('8df5e7e1-c348-4b37-b5fa-903c6b9549aa', 'Janina', 'Nowakowska', '+48 672 654 787',
        'janina.nowakowska@email.com',
        'serwis sprzątający', '5e89334f-09ec-4382-884c-6209c70e4939'),
       ('d57ee768-d7b2-42b3-9e80-c0cf22fbd54a', 'Elżbieta', 'Kwiatowska', '+48 233 421 587',
        'elzbieta.kowalska@email.com',
        'utrzymanie zieleni', '5e89334f-09ec-4382-884c-6209c70e4939'),
       ('e65281a1-fb2f-43a7-9f3e-20c3b6b639e4', 'Jan', 'Kowalski', '+48 987 987 654', 'jan.kowalski@email.com',
        'serwis techniczny', '5e89334f-09ec-4382-884c-6209c70e4939');

INSERT INTO public.room(id, number, type, available, hotel_id)
VALUES ('0bc20629-be4b-4ee3-aeea-4496d6ffc245', 1, 'studio', true, '5e89334f-09ec-4382-884c-6209c70e4939'),
       ('f2104c52-4ff2-46e2-b22b-22e9c2ae073e', 2, 'single', true, '5e89334f-09ec-4382-884c-6209c70e4939'),
       ('5e9cace1-8a65-4558-9c45-bd82f1ef6131', 3, 'family', true, '5e89334f-09ec-4382-884c-6209c70e4939'),
       ('bba2d5b2-7775-4cb4-aa3f-9d1d358d4890', 11, 'studio', true, '5e89334f-09ec-4382-884c-6209c70e4939'),
       ('fdf5b66d-2e56-4f57-9412-b2797efcc0a1', 12, 'single', true, '5e89334f-09ec-4382-884c-6209c70e4939');
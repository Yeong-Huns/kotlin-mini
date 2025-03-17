INSERT INTO car(id, brand, model, color, model_year, price, created_date_time, modified_date_time)
VALUES
    (1, 'BMW', 'i7', 'BLACK', '2022', '1000', now(), now()),
    (2, 'BMW', 'i7 M70', 'WHITE','2021', '2000', now(), now()),
    (3, 'BMW', 'iX', 'BLUE', '2020', '3000', now(), now()),
    (4, 'Audi', 'Q4 e-tron', 'SILVER', '2022', '1000', now(), now()),
    (5, 'Audi', 'Q6 e-tron', 'BLACK', '2021', '2000', now(), now()),
    (6, 'Audi', 'Q8 e-tron', 'BLUE', '2020', '3000', now(), now());

INSERT INTO user_info(id, firstname, lastname, created_date_time, modified_date_time)
VALUES
    (1, 'Yeonghun', 'Kim', now(), now()),
    (2, 'Cheolsoo', 'Kim', now(), now()),
    (3, 'Yeonghee', 'Kim', now(), now());

INSERT INTO car_owner(id, car_id, user_id, registration_id)
VALUES
    (1, 1, 1, '270bcbe1-0f5b-4d02-9018-fbb59733ff74'),
    (2, 2, 1, '5a7243fb-826b-4e88-ab28-58c8cc20afe5'),
    (3, 3, 1, 'c0c073be-e50a-4677-938c-5073883d6854'),
    (4, 3, 2, 'f44f583e-b663-4307-bc83-8d9f85cbc90f'),
    (5, 4, 2, 'eaa20686-cf9d-4e83-93ff-2f35043da199');

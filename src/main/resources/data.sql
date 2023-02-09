insert into book (id, name) values (1, 'The Fault In Our Stars');
insert into book (id, name) values (2, 'It Ends With Us');
insert into book (id, name) values (3, 'Paper Planes');
insert into book (id, name) values (4, 'Percy Jackson');

insert into author (aid, a_name, a_email) values (1, 'John Green', 'john@mail.com');
insert into author (aid, a_name, a_email) values (2, 'Colleen Hoover', 'colleen@mail.com');
insert into author (aid, a_name, a_email) values (3, 'Rick Riordan', 'rick@mail.com');

insert into borrower (bid, b_name, start_date, end_date) values (1, 'Harriette Barretto', '02-10-2022', '02-01-2023');
insert into borrower (bid, b_name, start_date, end_date) values (2, 'Pawan Kalligudda', '02-10-2022', '02-01-2023');

--update book set author_id=1 where id=1;
--update book set author_id=2 where id=2;
--update book set author_id=1 where id=3;
--update book set author_id=3 where id=4;

insert into book_authors values (1, 1);
insert into book_authors values (2, 2);
insert into book_authors values (3, 1);
insert into book_authors values (4, 3);
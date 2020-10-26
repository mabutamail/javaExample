DROP TABLE IF EXISTS tg_client CASCADE;
DROP TABLE IF EXISTS tg_order CASCADE;

CREATE table tg_client
(
    id serial,
    name text not null,
    comment text,
    primary key (id)
);

CREATE table tg_order
(
    id serial,
    createDate date not null,
    client integer  not null,
    price integer not null default 0,
    comment text,
    condition text not null default 1,
    primary key (id),
    foreign key (client) references tg_client(id) on delete restrict
);
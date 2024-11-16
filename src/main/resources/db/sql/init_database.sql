create table user
(
    id                bigint auto_increment
        primary key,
    email             varchar(255) null,
    password          varchar(255) null,
    registration_date datetime(6)  null,
    username          varchar(255) null
);

INSERT INTO user (email, password, registration_date, username)
VALUES ('superadmin@domain.com', '$2a$12$R1/ALYJh4Ixb3CR99H.4be1glzAdsrurzNQ3hqnibHDkPSX6lg6o2', '2024-11-02', 'super_admin');
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
VALUES ('superadmin@domain.com', '$2a$12$R1/ALYJh4Ixb3CR99H.4be1glzAdsrurzNQ3hqnibHDkPSX6lg6o2', '2024-11-02', 'super_admin'),
('superuser@domain.com', '$2a$12$HykVZDFJO65GwnQ9qypN..FJNo0fqGSSEghfw5eQp0ULAi4ab39U2', '2024-11-18', 'super_user');

create table role
(
    id   bigint auto_increment primary key,
    name varchar(255) null
);

INSERT INTO role (name)
VALUES ('ADMIN'), ('USER');


create table users_roles
(
    user_id bigint not null,
    role_id bigint not null,
    primary key (user_id, role_id),
    constraint const_user_id
        foreign key (user_id) references user (id),
    constraint const_role_id
        foreign key (role_id) references role (id)
);

INSERT INTO users_roles (user_id, role_id)
VALUES (1,1), (2,2);


drop table if exists employee_resume_info;

drop table if exists employer_info;

drop table if exists job_publish;

drop table if exists news;

drop table if exists news_img;

drop table if exists news_link;

drop table if exists user;

drop table if exists work_description;

drop table if exists work_experience;

/*==============================================================*/
/* Table: employee_resume_info                                  */
/*==============================================================*/
create table employee_resume_info
(
   id                   int(20) not null,
   resume_id            int(20),
   resume_name          varchar(50),
   race                 varchar(20),
   nav_place            varchar(20),
   born_place           varchar(20),
   party_org            varchar(10),
   graduation           varchar(100),
   study                varchar(50),
   education            varchar(20),
   work_years           varchar(20),
   health               varchar(20),
   job_attempt          varchar(50),
   photo_url            varchar(200),
   file_url             varchar(200),
   time                 datetime,
   user_id              int(20),
   primary key (id)
);

/*==============================================================*/
/* Table: employer_info                                         */
/*==============================================================*/
create table employer_info
(
   id                   int(20) not null,
   company_id           int(50),
   company_name         varchar(30),
   company_role         tinyint(1),
   company_size         varchar(10),
   company_introduction varchar(200),
   company_logo         varchar(200),
   time                 datetime,
   user_id              int(20),
   primary key (id)
);

/*==============================================================*/
/* Table: job_publish                                           */
/*==============================================================*/
create table job_publish
(
   id                   int(20) not null,
   job_id               int(20),
   resume_id            int(50),
   job                  varchar(30),
   company_id           int(20),
   job_required         varchar(500),
   publish_time         datetime,
   hunting_time         datetime,
   hunting_status       varchar(10),
   publish_status       varchar(10),
   primary key (id)
);

/*==============================================================*/
/* Table: news                                                  */
/*==============================================================*/
create table news
(
   id                   int(20) not null,
   news_id              int(20),
   user_id              int(20),
   title                varchar(100),
   sub_title            varchar(100),
   content              varchar(1000),
   time                 datetime,
   scope                tinyint(1),
   primary key (id)
);

/*==============================================================*/
/* Table: news_img                                              */
/*==============================================================*/
create table news_img
(
   id                   int(20) not null,
   news_id              int(20),
   img_url              varchar(200),
   img_name             varchar(500),
   time                 datetime,
   primary key (id)
);

/*==============================================================*/
/* Table: news_link                                             */
/*==============================================================*/
create table news_link
(
   id                   int(20),
   link_url             varchar(500),
   link_desc            varchar(1000),
   img_id               int(20),
   news_id              int(20),
   time                 datetime
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   int(20) not null auto_increment,
   login_id             varchar(50) not null,
   name                 varchar(50) default NULL,
   organization_id      int(11) default NULL,
   email                varchar(100) not null,
   passphrase           varchar(100) not null,
   salt                 varchar(100) not null,
   state                tinyint(1) default 1,
   date_created         timestamp not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   remark               varchar(200) default NULL,
   sex                  int(11) default NULL,
   cellphone            varchar(200) default NULL,
   role                 tinyint(1),
   primary key (id),
   unique key login_id (login_id),
   unique key email (email),
   key organization_id (organization_id)
);

/*==============================================================*/
/* Table: work_description                                      */
/*==============================================================*/
create table work_description
(
   id                   int(20) not null,
   resume_id            int(20),
   work_time            varchar(10),
   work_name            varchar(50),
   work_desc            varchar(200),
   work_duty            varchar(50),
   primary key (id)
);

/*==============================================================*/
/* Table: work_experience                                       */
/*==============================================================*/
create table work_experience
(
   id                   int(20) not null,
   resume_id            int(20),
   period               varchar(20),
   company              varchar(20),
   job                  varchar(30),
   primary key (id)
);

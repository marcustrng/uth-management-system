FROM postgres:15.4
COPY postgres-init.sql /docker-entrypoint-initdb.d/

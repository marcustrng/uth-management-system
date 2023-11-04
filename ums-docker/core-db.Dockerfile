FROM postgres:16.0-alpine
COPY core-db-init.sql /docker-entrypoint-initdb.d/
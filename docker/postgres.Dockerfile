FROM postgres:16.0-alpine
COPY postgres-init.sql /docker-entrypoint-initdb.d/

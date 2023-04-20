FROM clojure:temurin-11-lein-alpine

VOLUME /root/.m2

COPY . /usr/src/app
WORKDIR /usr/src/app
CMD ["lein", "repl", ":headless", ":host", "0.0.0.0", ":port", "31401"]
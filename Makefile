build:
	docker build -t noah-app .

run:
	docker run -v ~/.m2:/root/.m2 -p 31401:31401 --add-host=host.docker.internal:host-gateway -it noah-app

connect-repl:
	lein repl :connect localhost:31401

debug:
	clj -Sforce -Sdeps '{:deps {com.github.flow-storm/flow-storm-dbg {:mvn/version "RELEASE"}}}' -X flow-storm.debugger.main/start-debugger :port 31401 :debugger-host '"host.docker.internal"'

Basic template for trying remote debugging with FlowStorm(https://github.com/jpmonettas/flow-storm-debugger) on a docker application
	
## Instructions

- clone this repo, and cd into it
- make usre the procet.clj contains the latest versions of `com.github.jpmonettas/clojure` and `com.github.jpmonettas/flow-storm-inst` 
- `make build ` will build the docker image (run only once)
- `make run` will run the container, exposing nRepl port 31401 and sharing your ~/.m2 repo with it
- `make connect-repl` will connect a repl to the exposed 31401 server (requires lein on your box)
- `make debug` will run the debugger and connect to the process inside your docker through 31401

That last command should bring the debugger UI connected to your shadow nrepl server and browser application process.

Check that the bottom right indicators are (REPL and RUNTIME) are turned on (green).

Now go to your Clojure repl and eval #rtrace (+ 1 2 (* 3 4)) to run some instrumented code.

You should see the traced form on the debugger UI. Use the controls to step back and forth.

If everything is fine, great! you are successfully running it. Checkout the user guide for documentation on each tool https://jpmonettas.github.io/flow-storm-debugger/user_guide.html

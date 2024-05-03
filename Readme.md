Basic template for trying remote debugging with FlowStorm(https://github.com/flow-storm/flow-storm-debugger) on a docker application
with lein although the same can be done with deps.edn.
	
## Instructions

- clone this repo, and cd into it
- make sure the `project.clj` and `Makefile` contains the latest versions of the dependencies
- `make build ` will build the docker image (run only once)
- `make run` will run the container, exposing nRepl port 31401 and sharing your ~/.m2 repo with it
- `make connect-repl` will connect a repl to the exposed 31401 server (requires lein on your box)
- `make debug` will run the debugger and connect to the process inside your docker through 31401

That last command should bring the debugger UI connected to your shadow nrepl server and browser application process.

Check that the bottom right indicators are (REPL and RUNTIME) are turned on (green).

If everything is fine, great! you are successfully running it. 

If it is you first time using FlowStorm, go to Help->Tutorial for a quick tour.

Checkout the user guide for documentation on each tool https://flow-storm.github.io/flow-storm-debugger/user_guide.html

(defproject my.project "1.0.0"
  :profiles {:dev {:dependencies [[com.github.jpmonettas/clojure "1.11.1-1"]
                                  [com.github.jpmonettas/flow-storm-inst "3.5-alpha-1"] ]
                   :exclusions [org.clojure/clojure]
                   :jvm-opts ["-Dclojure.storm.traceEnable=true"
                              "-Dclojure.storm.instrumentEnable=true"
                              "-Dclojure.storm.instrumentOnlyPrefixes=user,foo"]}}
  :main foo.core)

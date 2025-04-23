(defproject my.project "1.0.0"
  :profiles {:dev {:dependencies [[com.github.flow-storm/clojure "1.12.0-9"]
                                  [com.github.flow-storm/flow-storm-dbg "4.4.0"] ]
                   :exclusions [org.clojure/clojure]
                   :jvm-opts ["-Dclojure.storm.instrumentEnable=true"]}}
  )

(defproject my.project "1.0.0"
  :profiles {:dev {:dependencies [[com.github.flow-storm/clojure "1.11.3"]
                                  [com.github.flow-storm/flow-storm-dbg "3.15.3"] ]
                   :exclusions [org.clojure/clojure]
                   :jvm-opts ["-Dclojure.storm.instrumentEnable=true"]}}
  )

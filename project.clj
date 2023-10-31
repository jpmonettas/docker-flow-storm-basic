(defproject my.project "1.0.0"
  :profiles {:dev {:dependencies [[com.github.flow-storm/clojure "1.11.1-11"]
                                  [com.github.flow-storm/flow-storm-dbg "RELEASE"] ]
                   :exclusions [org.clojure/clojure]
                   :jvm-opts ["-Dflowstorm.startRecording=true"
                              "-Dclojure.storm.instrumentEnable=true"
                              "-Dclojure.storm.instrumentOnlyPrefixes=user,foo"]}}
  :main foo.core)

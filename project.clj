(defproject my.project "1.0.0"
  :profiles {:dev {:dependencies [[com.github.jpmonettas/clojure "1.11.1-2"]
                                  [com.github.jpmonettas/flow-storm-inst "3.5.0"] ]
                   :exclusions [org.clojure/clojure]
                   :jvm-opts ["-Dflowstorm.startRecording=true"
                              "-Dclojure.storm.instrumentEnable=true"
                              "-Dclojure.storm.instrumentOnlyPrefixes=user,foo"]}}
  :main foo.core)

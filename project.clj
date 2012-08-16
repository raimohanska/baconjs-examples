(defproject baconjs "1.0.0-SNAPSHOT"
  :description "Bacon.js site"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.1"]
                 [hiccup "1.0.0"]]
  :plugins [[lein-ring "0.7.1"]]
  :ring {:handler baconjs.web/app})

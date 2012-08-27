(defproject baconjs "1.0.0-SNAPSHOT"
  :description "Bacon.js site"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.1"]
                 [hiccup "1.0.0"]
                 [ring/ring-jetty-adapter "0.3.9"]]
  :plugins [[lein-ring "0.7.1"]]
  :ring {:handler baconjs.web/app})

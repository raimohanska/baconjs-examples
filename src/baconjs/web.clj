(ns baconjs.web
  (:use compojure.core
        [hiccup.middleware :only (wrap-base-url)]
        ring.adapter.jetty)
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [compojure.response :as response]
            [ring.util.response :as resp]))

(defroutes main-routes
  (GET "/" [] (resp/redirect "/index.html"))
  (GET "/search/:query" [query]
      (str "Search result for "  query))
  (route/resources "/")
  (route/not-found "Page not found"))

(def app
  (-> (handler/site main-routes)
      (wrap-base-url)))

(defn -main []
  (let [port (Integer/parseInt (get (System/getenv) "PORT" "8080"))]
    (run-jetty app {:port port})))

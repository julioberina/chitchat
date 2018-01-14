(ns chitchat.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [selmer.parser :refer :all]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] (render-file "index.html" {}))
  (GET "/about" [] (render-file "about.html" {}))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))

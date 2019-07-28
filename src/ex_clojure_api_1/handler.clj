(ns ex-clojure-api-1.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ex-clojure-api-1.post :as post]
            [ring.middleware.json :refer [wrap-json-response wrap-json-body]]))

(defroutes app-routes
           (GET "/" [] "Hello World")

           (GET "/posts" []
             (post/find-all))
           (POST "/posts" req
             (let [name (get-in req [:body "name"])
                   category (get-in req [:body "category"])]
               (post/create name category)))
           (GET "/posts/:id" [id]
             (post/find-by-id id))
           (PUT "/posts/:id" req
             (let [id (read-string (get-in req [:params :id]))
                   name (get-in req [:body "name"])
                   category (get-in req [:body "category"])]
               (post/update-by-id id name category)
               (post/find-by-id id)))
           (DELETE "/posts/:id" [id]
             (post/delete-by-id id)
             (str "Deleted post " id))

           (route/not-found "Not Found"))

(def app
  (-> app-routes
      wrap-json-response
      wrap-json-body))

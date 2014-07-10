(ns myweb.routes.home
  (:use compojure.core)
  (:require [myweb.views.layout :as layout]
            [myweb.util :as util]))

(defn home-page []
  (layout/render
    "home.html" {:content (util/md->html "/md/docs.md")}))

(defn about-page []
  (layout/render "about.html"
                 {:name "云浩软件"
                  :value "<a href=login.cloudvast.com>登陆云浩</a>"}))
(defn some-page []
  (layout/render "some.html"
                 {:some "haohaoxuexi"
                  :title "some study resources"
                  :created-at (java.util.Date.)}))
(defn selmer-angularjs []
  (layout/render "selemer-angularjs-tag.html"
                 {:some "不好好学习"
                  :title "解决Selmer与AngularJS的标签混淆问题"}))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page))
  (ANY "/some" [] (some-page))
  (ANY "/selmer" [] (selmer-angularjs))
  )

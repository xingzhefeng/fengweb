(ns myweb.feng.quartz
  (:require [clojurewerkz.quartzite.scheduler :as qs]))

(defn -main
  [& m]
  (qs/initialize)
  (qs/start))
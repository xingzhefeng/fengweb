(use 'korma.db)
(require '[clojure.string :as str])

(def db {:classname   "com.mysql.jdbc.Driver"
         :subprotocol "mysql"
         :subname     "resources/db/korma.db"})
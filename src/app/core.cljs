(ns app.core)

(defn main []
  (let [c (.. js/document (createElement "DIV"))]
    (aset c "innerHTML" "<h1>Hello World!</h1>")
    (.. js/document (getElementById "app") (appendChild c))))

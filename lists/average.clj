(defn average
      [numbers]
      (/ (apply + numbers) (count numbers)))

(println (average [1 2 3 4 5 6]))

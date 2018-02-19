def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
  if(as.length > 1) {
    if(ordered(as(0), as(1))) isSorted(as.tail, ordered)
    else false
  } else true
}

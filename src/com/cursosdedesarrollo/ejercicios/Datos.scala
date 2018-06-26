package com.cursosdedesarrollo.ejercicios

object Datos {
  def main(args: Array[String]) {
    var tupla= (2,3)
    var listado: List[String] = List ()
    for ( a <- 1 to 50){
      listado= listado  ::: List(s"$a")
    }



    var mapa:Map[String,String] = Map()
    mapa += ("nombre" -> "Pepe")
    mapa += ("dirección" -> "Mayor 11")
    mapa += ("tlf" -> "+34 72653716253")
    mapa += ("email" -> "p@p.com")


    //var clientes: Map[String,Map[String,String]] = Map()
    println("Listado")
    listado.foreach({
      println
    })


    mapa.keys.foreach{ i =>
      print( "Clave = " + i )
      println(" Valor = " + mapa(i) )
    }

    tupla.productIterator.foreach{ i =>println("Value = " + i )}


    listado= listado  ::: List("hola","k","ase")
    println("Listado")
    listado.foreach({
      println
    })

    mapa += ("facturacion_total" -> "543321")
    mapa.keys.foreach{ i =>
      print( "Clave = " + i )
      println(" Valor = " + mapa(i) )
    }


    var cadena ="""Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus varius sagittis dapibus. Curabitur vitae tellus vel leo consectetur tincidunt quis non odio. Ut et nibh vitae sapien varius maximus. Phasellus laoreet quis urna nec varius. Donec sit amet faucibus risus. Cras mauris justo, rutrum ut condimentum id, finibus ut odio. Sed iaculis pretium eros. Suspendisse potenti. Nulla mi felis, pretium sed fermentum at, porttitor ac sem. Nunc suscipit est ut tellus ornare egestas. Curabitur varius convallis nisl, rhoncus hendrerit nisi vulputate id.

                  Praesent finibus eu turpis eget lacinia. Aliquam sollicitudin, elit ac hendrerit pharetra, risus velit accumsan diam, ac facilisis magna lorem ac diam. In hac habitasse platea dictumst. Nunc sed maximus lacus. In id scelerisque diam. Duis interdum facilisis ipsum, ut aliquet lacus sagittis id. Sed blandit blandit diam. Nam eget sem vitae elit cursus rhoncus et commodo ante.

                  Aenean ut rutrum elit. Cras scelerisque aliquet tristique. Nulla a est vitae velit feugiat egestas et non orci. Sed accumsan consequat tempus. Donec sit amet felis eget leo hendrerit placerat. Quisque mollis nisi a massa egestas consectetur. Quisque a mauris blandit, ornare enim at, tempus felis. Aenean vitae ex at tellus ultrices sollicitudin in nec tortor. Integer odio ex, scelerisque vel orci facilisis, fermentum blandit velit.

                  Sed sagittis elit sed risus ultricies bibendum. Donec nec enim mollis, vestibulum lorem eget, molestie arcu. Nam feugiat et metus vitae lacinia. Vivamus ullamcorper luctus libero, vitae suscipit urna. Duis euismod lectus lorem, non euismod metus scelerisque et. Fusce porttitor volutpat lectus, nec consectetur magna. Sed eu nibh odio. Nam tincidunt eget turpis at bibendum. Praesent sit amet tempor urna, eget rutrum ipsum. Aenean ac est quis felis viverra tincidunt sit amet eu nisi. Cras pretium rutrum nunc vitae fermentum. Sed aliquet pretium nunc. Fusce varius tellus magna, in eleifend nunc commodo non. Curabitur erat turpis, hendrerit non scelerisque quis, eleifend quis nulla. Nulla nec justo tincidunt, malesuada turpis at, placerat nisi.

                  Quisque nunc dui, pretium ac nunc et, consequat dictum lacus. Nulla nulla nulla, maximus id laoreet id, venenatis eget ligula. Maecenas aliquet rhoncus lacus in interdum. Nam auctor ante non tempus lacinia. Mauris sed porta erat. Suspendisse eu posuere felis. Aenean aliquam sapien vel suscipit luctus. Proin ut libero maximus, bibendum ligula in, egestas neque. Quisque auctor arcu non est mollis finibus. Aliquam tempus volutpat arcu vel pretium. Pellentesque ut justo a mauris hendrerit dapibus. Nam molestie lobortis felis, ut ullamcorper elit mattis eu."""
    println(cadena)
    var contador=0
    cadena.foreach( _ => {
      print(_)
      contador+=1
    })
    println("")
    println("Contador:" +contador)

    if ( cadena.toLowerCase contains "ipsum" ) {println ("Contiene Ipsum")}

    listado=listado.map( _+15)
    listado.foreach(println)

  }
}

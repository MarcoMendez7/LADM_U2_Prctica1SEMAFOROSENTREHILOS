package mx.tecnm.tepic.ladm_u2_prctica1semaforosentrehilos
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import  android.view.View
import java.lang.Exception


class Lienzo(p:MainActivity):View(p){
    var hilo=Hilo(this)
    var contadorHilo=0
    var contador=0
    var contadorV=0


    var mantener=true

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()
    c.drawColor(Color.WHITE)
    p.color = Color.GRAY
    c.drawRect(350f, 0f, 725f, 2200f, p)
    c.drawRect(0f, 800f, 1200f, 1175f, p)
    p.color = Color.BLACK
    c.drawRect(50f, 50f, 300f, 750f, p)
    c.drawRect(775f, 1225f, 1035f, 1950f, p)
    p.color = Color.WHITE
    c.drawRect(532.5f, 0f, 542.5f, 150f, p)
    c.drawRect(532.5f, 300f, 542.5f, 450f, p)
    c.drawRect(532.5f, 600f, 542.5f, 750f, p)
    c.drawRect(532.5f, 1175f, 542.5f, 1325f, p)
    c.drawRect(532.5f, 1475f, 542.5f, 1625f, p)
    c.drawRect(532.5f, 1775f, 542.5f, 1925f, p)
    c.drawRect(0f, 982.5f, 150f, 992.5f, p)
    c.drawRect(200f, 982.5f, 350f, 992.5f, p)
    c.drawRect(725f, 982.5f, 875f, 992.5f, p)
    c.drawRect(925f, 982.5f, 1075f, 992.5f, p)

        if (contadorHilo<=99){
contadorV++
        p.color=Color.RED
        c.drawCircle(175f,175f,100f,p)
        p.color = Color.rgb(167, 6, 6)
        c.drawCircle(900f, 1350f, 100f, p)
        p.color = Color.rgb(178, 178, 16)
        c.drawCircle(175f, 395f, 100f, p)
        c.drawCircle(900f, 1570f, 100f, p)
        p.color = Color.rgb(0, 152, 70)
        c.drawCircle(175f, 615f, 100f, p)
        p.color=Color.GREEN
        c.drawCircle(900f,1790f,100f,p)
            p.color=Color.CYAN
            c.drawRect(400f,(1+(6.5*contadorV)).toFloat(),500f, (150+(6.5*contadorV)).toFloat(),p)
            c.drawRect(584f,(1900-(7.2*contadorV)).toFloat(),684f,(2050-(7.2*contadorV)).toFloat(),p)
            p.color=Color.BLUE
            c.drawRect((200+(7*contador)).toFloat(),1034f,(350+(7*contador)).toFloat(), 1134f,p)
            c.drawRect((725f-(7*contador)).toFloat(),842f,(875-(7*contador)).toFloat(), 940f,p)


        }
        if ((contadorHilo>99&&contadorHilo<150 )){
            contadorV=0
            p.color=Color.RED
            c.drawCircle(175f,175f,100f,p)
            p.color = Color.rgb(167, 6, 6)
            c.drawCircle(900f, 1350f, 100f, p)
            p.color = Color.rgb(178, 178, 16)
            c.drawCircle(175f, 395f, 100f, p)
            p.color=Color.YELLOW
            c.drawCircle(900f, 1570f, 100f, p)
            p.color = Color.rgb(0, 152, 70)
            c.drawCircle(175f, 615f, 100f, p)
            c.drawCircle(900f,1790f,100f,p)
            p.color=Color.BLUE
            c.drawRect((200+(7*contador)).toFloat(),1034f,(350+(7*contador)).toFloat(), 1134f,p)
            c.drawRect((725-(7*contador)).toFloat(),842f,(875-(7*contador)).toFloat(), 940f,p)
            p.color=Color.CYAN
            c.drawRect(400f,650f,500f, 800f,p)
            c.drawRect(584f,1175f,684f, 1325f,p)
        }

        if (contadorHilo>150&&contadorHilo<200 ){
            contadorV++
            p.color = Color.rgb(167, 6, 6)
            c.drawCircle(175f,175f,100f,p)
            p.color=Color.RED
            c.drawCircle(900f, 1350f, 100f, p)
            p.color = Color.rgb(178, 178, 16)
            c.drawCircle(175f, 395f, 100f, p)
            c.drawCircle(900f, 1570f, 100f, p)
            p.color=Color.GREEN
            c.drawCircle(175f, 615f, 100f, p)
            p.color = Color.rgb(0, 152, 70)
            c.drawCircle(900f,1790f,100f,p)
            p.color=Color.CYAN
            c.drawRect(400f,(650+(14*contadorV)).toFloat(),500f, (800+(14*contadorV)).toFloat(),p)
            c.drawRect(584f,(1175-(14*contadorV)).toFloat(),684f, (1325-(14*contadorV)).toFloat(),p)

        }
        if ((contadorHilo>200&&contadorHilo<250 )){
            contadorV++

            p.color = Color.rgb(167, 6, 6)
            c.drawCircle(175f,175f,100f,p)
            p.color=Color.RED
            c.drawCircle(900f, 1350f, 100f, p)
            p.color=Color.YELLOW
            c.drawCircle(175f, 395f, 100f, p)
            p.color = Color.rgb(178, 178, 16)
            c.drawCircle(900f, 1570f, 100f, p)

            p.color = Color.rgb(0, 152, 70)
            c.drawCircle(175f, 615f, 100f, p)

            c.drawCircle(900f,1790f,100f,p)
            p.color=Color.BLUE
            c.drawRect((0+(4*contador)).toFloat(),1034f,(150+(4*contador)).toFloat(), 1134f,p)
            c.drawRect((950-(4*contador)).toFloat(),842f,(1100-(4*contador)).toFloat(), 940f,p)
            p.color=Color.CYAN

            c.drawRect(400f,(650+(14*contadorV)).toFloat(),500f, (800+(14*contadorV)).toFloat(),p)
            c.drawRect(584f,(1175-(14*contadorV)).toFloat(),684f, (1325-(14*contadorV)).toFloat(),p)
        }
        if(contadorHilo>250){
            contadorHilo=0
            contador=0;
            contadorV=0
        }




try {
    hilo.start()

}catch (e:Exception){

}

    }


}
class Hilo(p:Lienzo):Thread(){
    var puntero = p//Existe solo en esta linea.
    var mantener = true
    var despausado=true
    var may=true

    override fun run(){
        super.run()
        //Realmente se ejecuta una vez en segundo plano.
        while(mantener) {
                //puntero.text_1.text = "Hilo: " + puntero.contadorHilo
                puntero.run {
                    if(may){
                        sleep(200)
                        puntero.contadorHilo++
                        puntero.contador++
                        puntero.invalidate()
                        if(contadorHilo==199){
                            contador=1
                        }

                        if(puntero.contadorHilo==200){
                            may=true
                        }
                    }else{
                        sleep(200)
                        puntero.contadorHilo--
                        puntero.invalidate()
                        if(puntero.contadorHilo==0){
                            may=true
                        }
                    } }


        }
        sleep(200)
    }
}



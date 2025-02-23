package co.uk.philanderson

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RestController
import org.springframework.boot.runApplication
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import reactor.core.publisher.Flux
import java.time.Duration
import java.time.LocalDateTime
import java.util.concurrent.ThreadLocalRandom

@SpringBootApplication
class StockServiceApplication

fun main(args: Array<String>) {
	runApplication<StockServiceApplication>(*args)
}

@RestController
class RestController{
	companion object{
		var hi = "hello"
	}
	@GetMapping(value=["/stocks/{symbol}"],produces= [MediaType.TEXT_EVENT_STREAM_VALUE])
	fun prices(@PathVariable symbol: String): Flux<StockPrice> {
		return Flux.interval(Duration.ofSeconds(2))
				.map{StockPrice(symbol,randomStockPrice(), LocalDateTime.now(),hi)}
	}
	private fun randomStockPrice():Double{
		return ThreadLocalRandom.current().nextDouble(100.0);
	}
}
data class StockPrice (val symbol: String, val price:Double, val time: LocalDateTime,val printHello:String)

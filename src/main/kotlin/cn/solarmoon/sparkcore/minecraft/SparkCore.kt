package cn.solarmoon.sparkcore.minecraft

import net.neoforged.bus.api.IEventBus
import net.neoforged.fml.ModContainer
import net.neoforged.fml.common.Mod
import org.slf4j.LoggerFactory

@Mod(SparkCore.MOD_ID)
class SparkCore(
    val bus: IEventBus,
    val modContainer: ModContainer
) {

    companion object {
        const val MOD_ID = "sparkcore"
        val LOGGER = LoggerFactory.getLogger("星火核心")
        fun logger(prefix: String) = LoggerFactory.getLogger("星火核心/$prefix")
    }

    init {
    }

}
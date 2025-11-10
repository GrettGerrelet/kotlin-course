package org.example.kotlincourse.lessons.lesson18

import java.io.InputStream

interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getChargeLevel(): Double
    fun recharge()
}

abstract class Fridge: Openable, Powerable, TemperatureRegulatable
abstract class WashingMachine: Openable, Powerable, WaterConnection, Timable
abstract class SmartLamp: Powerable, LightEmitting
abstract class ElectronicWatches: Powerable, Timable, BatteryOperated
abstract class RobotVacuumCleaner: Powerable, Cleanable, Movable
abstract class MechanicalWatches: Mechanical
abstract class Flashlight: Powerable, LightEmitting, BatteryOperated
abstract class CoffeeMachine: Openable, Powerable, WaterContainer, Drainable
abstract class SmartSpeaker: Powerable, SoundEmitting, BatteryOperated

// Задача 2. Создай абстрактный класс для включаемого оборудования
// и имплементируй соответствующий интерфейс с реализацией методов (достаточно println с выполняемым действием).
abstract class TurnOnDevice {
    fun turnOn(device: Powerable) {
        device.powerOn()
        println("Устройство включено")
    }
}

//Задача 3. Создай абстрактный класс для программируемого оборудования
// (с имплементацией соответствующего интерфейса и реализацией методов) и наследуй его от абстрактного класса включаемого оборудования.
abstract class ProgrammedDevice: TurnOnDevice() {

}

//Задача 4. Создай абстрактный класс оборудования с возможностью устанавливать температуру
// и открываться и с наследованием от программируемого оборудования. Также имплементируй интерфейсы.
abstract class OpenAndTemperature: ProgrammedDevice() {

}

//Задача 5. Создай не абстрактные классы устройств с наследованием от абстрактного класса
// с возможностью устанавливать температуру и открываться.
// Холодильник
// Стиральная машина
// Чайник
// Духовка.

// Добавь недостающие интерфейсы и реализуй необходимые методы
// (достаточно вывод в консоль производимого действия).
// Обрати внимание на то, что установка температуры и программирование устройства (считай - задание режима работы)
// не имеет смысла при выключенном питании - добавь эту проверку.

//Создай объекты этих устройств и позапускай их с различными методами.
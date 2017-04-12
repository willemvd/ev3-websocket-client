# EV3 client

Required endpoints:
* Seek beacons:
  - ws://localhost:8080/ev3/seek -> none
  - ws://localhost:8080/ev3-result/seek -> nl.ocs.java.ev3.domain.SeekBeaconResult
* Move to position
  - ws://localhost:8080/ev3/turn -> nl.ocs.java.ev3.domain.Turn
  - ws://localhost:8080/ev3-result/turn -> nl.ocs.java.ev3.domain.TurnResult
* Shoot!
  - ws://localhost:8080/ev3/fire -> none
* Reset to neutral
  - ws://localhost:8080/ev3/reset -> none
  - ws://localhost:8080/ev3-result/reset -> nl.ocs.java.ev3.domain.ResetNeutralResult

/ev3 endpoints are input services

/ev3-result endpoints are response services
# Avelios Hospital-Patient gRPC server
A gRPC backend written in Java using Spring Boot.

## To run
`./gradlew bootRun`

## To test
Install `grpcurl` CLI tool: https://github.com/fullstorydev/grpcurl . Then run the commands below.
```bash
# Create a hospital (it will have id 1)
grpcurl -plaintext -d '{\"hospital\": {\"name\": \"Munich Hospital\", \"address\": \"Munich, Germany\", \"patient_capacity\": 1}}' localhost:9090 HospitalPatient/CreateHospital
# Create a patient (it will have id 2)
grpcurl -plaintext -d '{\"patient\": {\"name\": \"Deniz\", \"address\": \"Munich\", \"age\": 26}}' localhost:9090 HospitalPatient/CreatePatient
# Create another patient (it will have id 3)
grpcurl -plaintext -d '{\"patient\": {\"name\": \"Max\", \"address\": \"Munich\", \"age\": 25}}' localhost:9090 HospitalPatient/CreatePatient
# Register the first created patient into the hospital
grpcurl -plaintext -d '{\"hospital_id\": \"1\", \"patient_id\": \"2\"}' localhost:9090 HospitalPatient/RegisterPatient
# Try to register the second created patient into the hospital, which will fail because of the hospital capacity
grpcurl -plaintext -d '{\"hospital_id\": \"1\", \"patient_id\": \"3\"}' localhost:9090 HospitalPatient/RegisterPatient
# List all patients in the hospital (only the first patient)
grpcurl -plaintext -d '{\"hospital_id\": \"1\"}' localhost:9090 HospitalPatient/ListPatientsOfHospital
# List all hospitals of the first patient (only the hospital)
grpcurl -plaintext -d '{\"patient_id\": \"2\"}' localhost:9090 HospitalPatient/ListHospitalsOfPatient
# List all hospitals of the second patient (no hospital)
grpcurl -plaintext -d '{\"patient_id\": \"3\"}' localhost:9090 HospitalPatient/ListHospitalsOfPatient
```


variable "ami" {
  description = "Amzone Machine Image"
  default     = "ami-062f0cc54dbfd8ef1"

}

variable "instance" {
  description = "Instnace type"
  default     = "t2.micro"

}

variable "key" {
  description = "Key pair to connect ssh client"
  default     = "devops_key_pair"

}

variable "security" {
  description = "Security groups"
  default     = ["default"]

}

variable "intance_name" {
  description = "Intance name"
  default     = "LinuxVm"

}
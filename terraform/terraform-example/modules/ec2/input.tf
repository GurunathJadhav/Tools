variable "ami" {
  description = "Amazon Machine Image"
  default     = "ami-062f0cc54dbfd8ef1"

}

variable "intance" {
  description = "Instnace Type"
  default     = "t2.micro"

}
variable "key_pair" {
  description = "Key pair to connect with ssh client"
  default     = "devops_key_pair"

}

variable "security" {
  description = "Security groups"
  default     = ["default"]

}
variable "instance_name" {
  description = "Instance Name"
  default     = "LinuxVm"

}
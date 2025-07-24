variable "ami" {
  default     = "ami-0e35ddab05955cf57"
  description = "Amazon Machine Image"

}

variable "instance_type" {
  default     = "t2.medium"
  description = "Instance ype"

}
variable "key_pair" {
  default     = "devops_key_pair"
  description = "Key pair for ssh connectivity"

}
variable "security_groups" {
  default     = ["default"]
  description = "security group"

}
variable "instnace_name" {
  default     = "jenkins_server"
  description = "Instance name"

}
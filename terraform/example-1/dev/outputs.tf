output "instance-public-ip" {
  value = aws_instance.vm_1.public_ip

}
output "instance-private-ip" {
  value = aws_instance.vm_1.private_ip

}

output "instance-complete-info" {
  value = aws_instance.vm_1

}